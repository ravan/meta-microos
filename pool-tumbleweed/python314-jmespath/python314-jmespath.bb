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

RPM_NAME = "python314-jmespath-1.1.0-1.3.noarch.rpm"
RPM_HASH = "5be7e2704f595b1ebfe9ab1f23919cb634d2999f6eaa108d68c9b1625933c53af069edc2e51660067b4a71cc70b8eb5348c2678283095f255291af354f880482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jmespath \
python314-jmespath \
python3dist-jmespath"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-ply"

inherit rpm
