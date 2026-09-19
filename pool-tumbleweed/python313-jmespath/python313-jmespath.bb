SUMMARY = "Python module for declarative JSON document element extraction"
DESCRIPTION = "JMESPath (pronounced 'jaymz path') allows you to declaratively specify how \
to extract elements from a JSON document. \
 \
For example, given this document: \
 \
{'foo': {'bar': 'baz'}} \
 \
The jmespath expression foo.bar will return 'baz'. \
 \
JMESPath also supports: \
 \
Referencing elements in a list. Given the data: \
 \
{'foo': {'bar': ['one', 'two']}} \
 \
The expression: foo.bar[0] will return 'one'. You can also reference all \
the items in a list using the * syntax: \
 \
{'foo': {'bar': [{'name': 'one'}, {'name': 'two'}]}} \
 \
The expression: foo.bar[*].name will return ['one', 'two']. Negative \
indexing is also supported (-1 refers to the last element in the list). \
Given the data above, the expression foo.bar[-1].name will return ['two']. \
 \
The * can also be used for hash types: \
 \
{'foo': {'bar': {'name': 'one'}, 'baz': {'name': 'two'}}} \
 \
The expression: foo.*.name will return ['one', 'two']."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-jmespath-1.1.0-1.3.noarch.rpm"
RPM_HASH = "5dfcbdfae4dd95d6056a3900fcec1ffe43511dec141afe5d3b7c7403246f7874b66dc5e6ea9c3538fd81b715678c02748f33966cc1e042101b7fc97bbf387c80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jmespath \
python3.13dist-jmespath \
python313-jmespath \
python3dist-jmespath"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-ply"

inherit rpm
