SUMMARY = "Routing Recognition and Generation Tools"
DESCRIPTION = "A Routing package for Python that matches URL's to dicts and vice versa."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python314-Routes-2.5.1-5.5.noarch.rpm"
RPM_HASH = "caf60a6cc483da76c5986b55665e8095321234fa9eefa96b955eac9c77f0fb83cc8f6d15fba0a1b06deb7fbf2e15d210af86286cd1422acfa86b51adf3298063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-routes \
python314-Routes \
python314-routes \
python3dist-routes"

RDEPENDS:${PN} += "python-abi \
python314-repoze.lru"

inherit rpm
