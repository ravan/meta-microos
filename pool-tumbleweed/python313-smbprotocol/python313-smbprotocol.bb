SUMMARY = "SMBv2/v3 client for Python 2 and 3"
DESCRIPTION = "This library implements the SMBv2 and SMBv3 protocol. \
 \
Features \
-------- \
-  Negotiation of the SMB 2.0.2 protocol to SMB 3.1.1 (Windows 10/Server \
   2016) \
-  Authentication with both NTLM and Kerberos \
-  Message signing \
-  Message encryption (SMB 3.x.x+) \
-  Connect to a Tree/Share \
-  Opening of files, pipes and directories \
-  Set create contexts when opening files \
-  Read and writing of files and pipes \
-  Sending IOCTL commands \
-  Sending of multiple messages in one packet (compounding)"
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python313-smbprotocol-1.17.0-1.1.noarch.rpm"
RPM_HASH = "799e154399b26cbf2c294b1d333142a04baf4f959ebae1f92a0d456574432cec0338e7c0a080318a6bcc210c1158fff63618909b5c52d7d215a2a1f09919a504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smbprotocol \
python3.13dist-smbprotocol \
python313-smbprotocol \
python3dist-smbprotocol"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-pyspnego"

inherit rpm
