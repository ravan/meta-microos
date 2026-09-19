SUMMARY = "Verify the state of the clients connected to a openvpn server"
DESCRIPTION = "The -H [IP or hostname of the openvpn server] and -p options [port of the \
openvpn server] are always obligatory. If plugin can be connected with the \
management interface it will show the common name (as it is specified in the \
client certificate) of the connected clients. Otherwise, it will finish with \
critical state. The -i option shows the remote IP address of the client instead \
of their common name and the -n option shows the number of connected clients. \
It is possible to be verified that a client in particular is connected using \
one of these two options -C [common name] or -r [remote IP address]. If these \
options are used, also the exit state is due to specify that will give back \
plugin if it does not find the client through the -w [warning] -c [critical] \
options."
LICENSE = "GPL-3.0-only"

PV = "1.1"

RPM_NAME = "monitoring-plugins-openvpn-1.1-103.7.noarch.rpm"
RPM_HASH = "90dcd339308abd2c999427cb036b7b033b35568206a769e948d07266bf58c251f80ff4859eb865099cfeddd9394dbf2464616aa163a60bf073ec96f4d6d6cd9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-openvpn \
monitoring-plugins-openvpn \
nagios-plugins-openvpn"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl \
perl-Net--Telnet"

inherit rpm
