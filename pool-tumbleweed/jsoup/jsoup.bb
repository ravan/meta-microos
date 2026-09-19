SUMMARY = "Java library for working with HTML"
DESCRIPTION = "jsoup is a Java library for working with HTML. \
It provides an API for extracting and manipulating data, \
using DOM, CSS, and jquery-like methods. \
 \
jsoup implements the WHATWG HTML5 specification. \
 \
 - scrapes and parses HTML from a URL, file, or string \
 - finds and extracts data, using DOM traversal or CSS selectors \
 - manipulates the HTML elements, attributes, and text \
 - cleans user-submitted content against a safe white-list, \
   to prevent XSS attacks \
 - outputs tidied HTML \
 \
jsoup can deal with invalid HTML tag soup."
LICENSE = "MIT"

PV = "1.23.2"

RPM_NAME = "jsoup-1.23.2-1.1.noarch.rpm"
RPM_HASH = "f84c3d20f4f644caa18f9adfccb1d5103c78e019153ff4f067ec46654c4ae0fbc4c76b24a7e267ceeaa08ac1f381e35317a203aa6359394cfa085bdf6949f6fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsoup \
mvn-org.jsoup-jsoup \
mvn-org.jsoup-jsoup-pom- \
osgi-org.jsoup"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
