import groovy.json.JsonBuilder

String html = """TBD"""

String x = new JsonBuilder( html )
.toString()
.replaceAll(/\\"/, "'")  // " → '
.replaceAll(/\\n/, " ")  // \n → ' '
.replaceAll(/\s+/, ' ')  // consolidate spaces

println '---------- BEGIN ----------'
println x
println '---------- END ----------'
