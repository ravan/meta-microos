SUMMARY = "ReStructuredText viewer"
DESCRIPTION = "A viewer for ReStructuredText documents that renders them on the fly."
LICENSE = "GPL-3.0-only"

PV = "3.0.2"

RPM_NAME = "python313-restview-3.0.2-1.2.noarch.rpm"
RPM_HASH = "a567ce2b3f3eeb2393c1d1f9e869e816411687185b7fee1639634732c3e70450e9c655c24691a891604075b3c57cce393bef620ee5efaf712449132702576fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-restview \
python3.13dist-restview \
python313-restview \
python3dist-restview"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-docutils \
python313-pygments \
python313-readme-renderer"

inherit rpm
