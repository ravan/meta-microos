SUMMARY = "Django settings using TOML configuration files"
DESCRIPTION = "Django settings using TOML configuration files."
LICENSE = "Apache-2.0"

PV = "0.0.4"

RPM_NAME = "python313-django-settings-toml-0.0.4-3.5.noarch.rpm"
RPM_HASH = "71a8380bab705907de6abfe7dd5de8485008e3fb6a89df7b3fa1dc592c8426ecf8de86ca722129dd5a31c64a174c30a48c99513aa8cf8ab2c26e5d13b854f484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-settings-toml \
python3.13dist-django-settings-toml \
python313-django-settings-toml \
python3dist-django-settings-toml"

RDEPENDS:${PN} += "python-abi \
python313-toml"

inherit rpm
