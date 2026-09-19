SUMMARY = "Stateful programmatic web browsing"
DESCRIPTION = "Stateful programmatic web browsing in Python. Browse pages \
programmatically with HTML form filling and clicking \
of links."
LICENSE = "BSD-3-Clause & (BSD-3-Clause | ZPL-2.1)"

PV = "0.4.10"

RPM_NAME = "python314-mechanize-0.4.10-3.5.noarch.rpm"
RPM_HASH = "9e162808606bcdc2005e7526c9dcd88f36a614b0e859b4019865e92e78decc26614daa70efa87c0a3666cdfe02aaeee2059c3269a71797e12350da73509f48be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mechanize \
python314-mechanize \
python3dist-mechanize"

RDEPENDS:${PN} += "python-abi \
python314-html5lib"

inherit rpm
