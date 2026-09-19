SUMMARY = "A collection of classes implementing the pen protocol for manipulating glyphs"
DESCRIPTION = "A collection of classes implementing the pen protocol for manipulating glyphs."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python314-fontPens-0.2.4-7.5.noarch.rpm"
RPM_HASH = "fb3e372297fa09f3acfbb360cf81ec2e4f45b2895a3be8311a489acde7992994d2c7488fb203d1d3a731d6207ee70b1fc05e5223b35b53a5afd2151a9b833e6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fontpens \
python314-fontPens \
python3dist-fontpens"

RDEPENDS:${PN} += "python-abi \
python314-FontTools"

inherit rpm
