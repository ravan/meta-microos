SUMMARY = "Static file serving for WSGI applications"
DESCRIPTION = "Static file serving for WSGI applications."
LICENSE = "MIT"

PV = "6.12.0"

RPM_NAME = "python313-whitenoise-6.12.0-1.3.noarch.rpm"
RPM_HASH = "a6319936713e26d33e660080f146dcd9721ab4285d39944b7485bb57d0d947f57aeff9847f841f2aa82fa83d6f449fb4332d52064c8c5610c7796b249aa1b5fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whitenoise \
python3.13dist-whitenoise \
python313-whitenoise \
python3dist-whitenoise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
