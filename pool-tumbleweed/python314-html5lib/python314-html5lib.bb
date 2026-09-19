SUMMARY = "HTML parser based on the WHAT-WG Web Applications 1"
DESCRIPTION = "HTML parser designed to follow the HTML5 \
specification. The parser is designed to handle all flavours of HTML and \
parses invalid documents using well-defined error handling rules compatible \
with the behaviour of major desktop web browsers. \
 \
Output is to a tree structure; the current release supports output to \
DOM, ElementTree, lxml and BeautifulSoup tree formats as well as a \
simple custom format"
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python314-html5lib-1.1-8.4.noarch.rpm"
RPM_HASH = "a8262d8ccc7ed3dd784ba0411b91dc364e40b6d6597dd0efca0db67f477cbf1292f0bd1e7e4406fef34bb165f7121a8422884f7ea1567718562d7e44179d5e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-html5lib \
python314-html5lib \
python3dist-html5lib"

RDEPENDS:${PN} += "python-abi \
python314-six \
python314-webencodings"

inherit rpm
