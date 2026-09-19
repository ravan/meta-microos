SUMMARY = "Startup script shared by all Python interpreters"
DESCRIPTION = "The primary purpose of this package is to share script which can \
be run via PYTHONSTARTUP variable of any Python interpreter."
LICENSE = "Python-2.0"

PV = "0.1"

RPM_NAME = "shared-python-startup-0.1-6.17.noarch.rpm"
RPM_HASH = "5c5d9b47112d74738566026f18f775da804f56ae1cce239d811ec97e720ea263eb2c2859cfee30c4bcd3acb0055ee4e5cdbd24aeb343a35399f6aec07ae399e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-shared-python-startup \
shared-python-startup"

RDEPENDS:${PN} += ""

inherit rpm
