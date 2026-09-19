SUMMARY = "Sphinx 'youtube' extension"
DESCRIPTION = "Sphinx 'youtube' extension"
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python314-sphinxcontrib-youtube-1.5.0-1.2.noarch.rpm"
RPM_HASH = "cc8b3276543342302b30f7e4340cd8b1e81ad37e73866829083d9272e462955923522005b7f8a5ec9a1bf6f588fb3a5f6335a0428bb35aac8d0dd39ec19e1e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-youtube \
python314-sphinxcontrib-youtube \
python3dist-sphinxcontrib-youtube"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-requests"

inherit rpm
