SUMMARY = "Python3 bindings for the BPF Compiler Collection"
DESCRIPTION = "Python 3.x bindings for the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.37.0"

RPM_NAME = "python314-bcc-0.37.0-4.1.noarch.rpm"
RPM_HASH = "60b00cf4c32bf3711a55af14748f0ab085071d6e30998cf894b9cd9fa7f6e829411310e6b0d44be2647ee633eb2f47ca91e29e055df6e41c33a580e59eb834d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bcc \
python314-bcc \
python3dist-bcc"

RDEPENDS:${PN} += "libbcc0 \
python-abi"

inherit rpm
