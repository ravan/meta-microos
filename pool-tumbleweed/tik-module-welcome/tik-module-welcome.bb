SUMMARY = "Welcome module for tik"
DESCRIPTION = "Welcome module for tik. Greets the user before installation."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "tik-module-welcome-1.5.1-3.1.noarch.rpm"
RPM_HASH = "50f37b9b3cb9ff709f484f4d34d8a79ba2f8db6acb67a2a20ee2f2e3ce30c5861b5239163ab6562004489bf2df7a4e64b16f7b3d9a54248441339a9c641ed9be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tik-module-welcome"

RDEPENDS:${PN} += "tik"

inherit rpm
