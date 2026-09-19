SUMMARY = "Django settings using TOML configuration files"
DESCRIPTION = "Django settings using TOML configuration files."
LICENSE = "Apache-2.0"

PV = "0.0.4"

RPM_NAME = "python314-django-settings-toml-0.0.4-3.5.noarch.rpm"
RPM_HASH = "38e2e0b52197c7d9755690bfc683b6c83d7c3d024c8e42f8f122d10e70bfda0f2f1dbee599b5571d9220e3cde9f747fbbe61b7a6ba201f5443955d033632006c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-settings-toml \
python314-django-settings-toml \
python3dist-django-settings-toml"

RDEPENDS:${PN} += "python-abi \
python314-toml"

inherit rpm
