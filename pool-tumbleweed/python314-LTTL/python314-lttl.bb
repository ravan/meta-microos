SUMMARY = "Library for text processing and analysis"
DESCRIPTION = "LangTech Text Library (LTTL) for text processing and analysis"
LICENSE = "GPL-3.0-only"

PV = "2.0.12"

RPM_NAME = "python314-LTTL-2.0.12-4.5.noarch.rpm"
RPM_HASH = "00654e329d0bdac570c988c561725fc880e5e38d4b74fd8351a7622e01c76149dda1bdd09311d54c35d9add8e8266eac915ab4e36d08c63d7bb267791e6bba21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lttl \
python314-LTTL \
python3dist-lttl"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-scipy"

inherit rpm
