SUMMARY = "Pass backend for python-keyring"
DESCRIPTION = "python-keyring backend getting data from pass."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python313-keyring-pass-0.9.3-1.5.noarch.rpm"
RPM_HASH = "6b582ae416c994c881f53901ab9f9b6651fc726ac550d7821e58bffd0295c800abb22b8f423b77d58d11412c6d9c9f4ff43f7ff391de319361fb44403310cbcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keyring-pass \
python3.13dist-keyring-pass \
python313-keyring-pass \
python3dist-keyring-pass"

RDEPENDS:${PN} += "password-store \
python-abi \
python313-jaraco.classes \
python313-keyring"

inherit rpm
