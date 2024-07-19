import groovy.json.JsonBuilder

String html = """TBD"""

println '---------- BEGIN ----------'
println new JsonBuilder( html ).toPrettyString()
println '---------- END ----------'
