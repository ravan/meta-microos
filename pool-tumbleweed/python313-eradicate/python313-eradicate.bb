SUMMARY = "Python utility for removing commented-out code"
DESCRIPTION = "With modern revision control available, there is no reason to save \
commented-out code to your repository. 'eradicate' helps cleans up \
existing junk comments. It does this by detecting block comments that \
contain valid Python syntax that are likely to be commented out code. \
(It avoids false positives like the sentence 'this is not good', \
which is valid Python syntax, but is probably not code.)"
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python313-eradicate-3.0.1-1.4.noarch.rpm"
RPM_HASH = "605333a0b7c581711167d561c07d6834a2adc85e2b1e0502344b5f277b670d13318b9554f7db6d1f0b28f27d8dbf6db12c905d4c80bfa1232e97560d162c9bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-eradicate \
python3.13dist-eradicate \
python313-eradicate \
python3dist-eradicate"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
