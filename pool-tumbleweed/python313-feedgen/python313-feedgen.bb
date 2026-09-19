SUMMARY = "Python feed generator module (ATOM, RSS, Podcasts)"
DESCRIPTION = "This module can be used to generate web feeds in both ATOM and RSS \
format. It has support for extensions."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "python313-feedgen-1.0.0-2.5.noarch.rpm"
RPM_HASH = "e5ae543d4de8806fec2292a9addf51509e1149d516905233bdbf845067bcf8d5cf55249a242acf54d5d3e406278fa9eacec166b30a0a78df802a018b46ee27a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-feedgen \
python3.13dist-feedgen \
python313-feedgen \
python3dist-feedgen"

RDEPENDS:${PN} += "python-abi \
python313-lxml \
python313-python-dateutil"

inherit rpm
