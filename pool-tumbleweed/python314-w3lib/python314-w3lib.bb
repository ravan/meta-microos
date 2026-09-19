SUMMARY = "Library of Web-Related Functions"
DESCRIPTION = "This is a Python library of web-related functions, such as: \
 \
* remove comments, or tags from HTML snippets \
 \
* extract base url from HTML snippets \
 \
* translate entites on HTML strings \
 \
* encoding mulitpart/form-data \
 \
* convert raw HTTP headers to dicts and vice-versa \
 \
* construct HTTP auth header \
 \
* converting HTML pages to unicode \
 \
* RFC-compliant url joining \
 \
* sanitize urls (like browsers do) \
 \
* extract arguments from urls"
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python314-w3lib-2.4.1-1.3.noarch.rpm"
RPM_HASH = "cf0735ac10e4e24f9f9608ddf4f86640bcb98b401b4b84a7334b38d84a6df84fb513c911bffd3c808f7cbb5c91857b72e7bd273fedf3398f3ce90a77a4f8c8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-w3lib \
python314-w3lib \
python3dist-w3lib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
