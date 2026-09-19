SUMMARY = "SSH tunnels to remote server"
DESCRIPTION = "The sshtunnel package allows one to create SSH tunnels using local \
or remote port forwarding. Thus, it provides a Python wrapper to \
the same functionality provided by the SSH command using the -L \
and -R parameters."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-sshtunnel-0.4.0-7.2.noarch.rpm"
RPM_HASH = "eaf51dcd54396f7b9a861608295c4812257683a331b5a96b1ef7e3567c198c64a35e696489ed5cec05147212cde42ec6256c93cee517b58532115ca828c098af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sshtunnel \
python3.13dist-sshtunnel \
python313-sshtunnel \
python3dist-sshtunnel"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
openssh \
python-abi \
python313-paramiko"

inherit rpm
