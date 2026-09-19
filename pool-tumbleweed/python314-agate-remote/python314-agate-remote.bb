SUMMARY = "Read support for remote files for agate"
DESCRIPTION = "Agate-remote adds read support for remote files to agate."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python314-agate-remote-0.2.3-2.3.noarch.rpm"
RPM_HASH = "5b897381fbc7d9cf2ad7483930769d5699a27c2269f8cfe3af1245c35f199449031091ec304c0dc73435ed817d7fa9eea812d9508bfba2b03fbfb54164cbfe9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-agate-remote \
python314-agate-remote \
python3dist-agate-remote"

RDEPENDS:${PN} += "python-abi \
python314-agate \
python314-requests"

inherit rpm
