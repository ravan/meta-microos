SUMMARY = "Config to permit root logins to sshd"
DESCRIPTION = "The openssh-server package by default disallows password based \
root logins. This package provides a config that does. It's useful \
to temporarily have a password based login to be able to use \
ssh-copy-id(1)."
LICENSE = "BSD-2-Clause & MIT"

PV = "10.5p1"

RPM_NAME = "openssh-server-config-rootlogin-10.5p1-1.2.aarch64.rpm"
RPM_HASH = "1e4308e1bbc6623eefc9c50f7de206224788b69208bfed4395953b1d54a3a36dce735dcdb2a2b11d5123fe0f8166ee2addb40d5266f85759c9d023741ad531e0"

RPROVIDES:${PN} += "openssh-server-config-rootlogin"

RDEPENDS:${PN} += "openssh-server"

inherit rpm
