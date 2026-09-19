SUMMARY = "Library for text processing and analysis"
DESCRIPTION = "LangTech Text Library (LTTL) for text processing and analysis"
LICENSE = "GPL-3.0-only"

PV = "2.0.12"

RPM_NAME = "python313-LTTL-2.0.12-4.5.noarch.rpm"
RPM_HASH = "77e31a53d3a2cc39c5e47aa533c6e6948abe3527b72c58ce0a7dedd7f85199522b0c21ce67abf3d7513b49a8256d69b5ff3366f762eeaa005bf637b1343abf4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-LTTL \
python3.13dist-lttl \
python313-LTTL \
python3dist-lttl"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-scipy"

inherit rpm
