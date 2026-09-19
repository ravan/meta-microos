SUMMARY = "RFC-compliant FQDN validation and manipulation for Python"
DESCRIPTION = "This package validates Fully Qualified Domain Names (FQDNs) conforming to the \
Internet Engineering Task Force specification . The design intent is to \
validate that a string would be traditionally acceptable as a public Internet \
hostname to RFC-conforming software, which is a strict subset of the logic in \
modern web browsers like Mozilla Firefox and Chromium that determines whether \
make a DNS lookup. Configuration options can relax constraints so that short \
hostnames without periods or others with underscores will be valid. These \
relaxations are closer to how modern web browsers work."
LICENSE = "MPL-2.0"

PV = "1.5.1"

RPM_NAME = "python313-fqdn-1.5.1-3.12.noarch.rpm"
RPM_HASH = "8045ed549b9b6707623a6d305b44613405f501581702ac319389326c4a26635a30501f05566306c89cba69474f6d645170522791a52af92760afa7b8fe678747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fqdn \
python3.13dist-fqdn \
python313-fqdn \
python3dist-fqdn"

RDEPENDS:${PN} += "python-abi"

inherit rpm
