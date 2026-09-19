SUMMARY = "A wrapper for the GNU Privacy Guard (GPG or GnuPG)"
DESCRIPTION = "This module allows access to GnuPG's key management, \
encryption and signature functionality from Python programs."
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python314-python-gnupg-0.5.6-2.1.noarch.rpm"
RPM_HASH = "6b7f734f93aca58cc29a742c724715efac05c6e3683ef453a664a0376c5cb38abdb54a8a593bf65efca8cd5e961b63b5a8d6d4341d11314434cda95874cde2bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-gnupg \
python314-gnupg \
python314-python-gnupg \
python3dist-python-gnupg"

RDEPENDS:${PN} += "gpg2 \
python-abi"

inherit rpm
