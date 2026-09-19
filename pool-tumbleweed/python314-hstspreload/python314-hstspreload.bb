SUMMARY = "Python Chromium HSTS Preload list"
DESCRIPTION = "Chromium HSTS Preload list as a Python package."
LICENSE = "BSD-3-Clause"

PV = "2026.8.1"

RPM_NAME = "python314-hstspreload-2026.8.1-1.1.noarch.rpm"
RPM_HASH = "6550134a9dd8a861ac7a659018c4442e5aacbb95ada86305eafc95295b8a3f4db55556d05c69721dc26907a496d4a66462af0412a03bd512e71edf30531e3198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hstspreload \
python314-hstspreload \
python3dist-hstspreload"

RDEPENDS:${PN} += "python-abi"

inherit rpm
