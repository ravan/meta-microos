SUMMARY = "DuckDuckGo from the terminal"
DESCRIPTION = "A cmdline utility to search DuckDuckGo from the terminal. Similar to googler for Google. \
 \
Unlike the web interface, you can specify the number of search results you would like to see per page. It's more convenient than skimming through 30-odd search results per page. The default interface is carefully designed to use minimum space without sacrificing readability."
LICENSE = "GPL-3.0-only"

PV = "2.2"

RPM_NAME = "ddgr-2.2-1.8.noarch.rpm"
RPM_HASH = "5237a736850b51de8fc2aeb8667cc115dcb19a1df97c147490a9ed85e01104b9d4582a5284fb885acfa2856d13ea129d9aeec1aa224d42867880af8baebb5463"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddgr"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3"

inherit rpm
