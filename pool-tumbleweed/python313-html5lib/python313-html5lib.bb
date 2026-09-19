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

RPM_NAME = "python313-html5lib-1.1-8.4.noarch.rpm"
RPM_HASH = "40900b9b533d246e5beb19cefa1d8acfff7a3243bb5000b010f4613029ea4c09b2d3edcc61a747fd9847836dcc4e8b21009a774f66cfac98d42a97ae2fbfccb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-html5lib \
python3.13dist-html5lib \
python313-html5lib \
python3dist-html5lib"

RDEPENDS:${PN} += "python-abi \
python313-six \
python313-webencodings"

inherit rpm
