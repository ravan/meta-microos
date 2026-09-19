SUMMARY = "Network Configuration Files in /etc"
DESCRIPTION = "All of the basic configuration files for the network programs including \
/etc/aliases, /etc/protocols, and /etc/services. \
 \
These are often used by network routines in the C library and therefore \
must be installed for all network programs."
LICENSE = "BSD-3-Clause"

PV = "11.6"

RPM_NAME = "netcfg-11.6-14.2.noarch.rpm"
RPM_HASH = "bb6b5f85cdad1956dd292551a85c4beec21f2cadfc881c38a7ffb8b265cc710f7a83f29b06005a5e80fb003458b3694511fef8b6959dbd7427d9dae8c642c0fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-netcfg \
netcfg"

RDEPENDS:${PN} += "libnss-usrfiles2"

inherit rpm
