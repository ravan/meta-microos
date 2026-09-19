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

RPM_NAME = "python314-smbprotocol-1.17.0-1.1.noarch.rpm"
RPM_HASH = "6c1c46f8c23ea53404d42d9bd20d9de4454b26df22851f8815bba13d5d62b71e1eab82c4a24484189e67a41e5f2fba3d166e60c44772ef3d0c180423bf324afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-smbprotocol \
python314-smbprotocol \
python3dist-smbprotocol"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-pyspnego"

inherit rpm
