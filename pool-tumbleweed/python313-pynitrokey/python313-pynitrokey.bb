SUMMARY = "Python Library for Nitrokey devices"
DESCRIPTION = " \
 \
A command line interface for the Nitrokey FIDO2, Nitrokey Start, Nitrokey 3 and \
NetHSM. \
 \
 \
 \
``` \
$ nitropy --help \
``` \
 \
 \
 \
The user documentation for the `nitropy` CLI is available on [docs.nitrokey.com](https://docs.nitrokey.com/software/nitropy/index.html). See also the product documentation for more information on the available commands: \
- [Nitrokey 3](https://docs.nitrokey.com/nitrokey3/index.html) \
- [Nitrokey FIDO2](https://docs.nitrokey.com/fido2/index.html) \
- [Nitrokey Start](https://docs.nitrokey.com/start/index.html) \
- [NetHSM](https://docs.nitrokey.com/nethsm/index.html)"
LICENSE = "Apache-2.0 | MIT"

PV = "0.12.3"

RPM_NAME = "python313-pynitrokey-0.12.3-1.2.noarch.rpm"
RPM_HASH = "f3e8a4fb1227d848363c442544287e6a2e3e78f3d0d2f3856b39e7555b70c3c81e96683a8aa3ae14a3bea8c97a2de1f3352d7d5c84f5e400d588ed2661e6923f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nitropy \
python3-pynitrokey \
python3.13dist-pynitrokey \
python313-pynitrokey \
python3dist-pynitrokey"

RDEPENDS:${PN} += "-intelhex >= 2.3 with intelhex < 3 \
-python313-cffi >= 1.15 with python313-cffi < 3 \
-python313-click >= 8.2 with python313-click < 9 \
-python313-cryptography >= 43 with python313-cryptography < 50 \
-python313-fido2 >= 2 with python313-fido2 < 3 \
-python313-hidapi >= 0.14.0.post2 with python313-hidapi < 0.14.0.post3 \
-python313-libusb1 >= 3 with python313-libusb1 < 4 \
-python313-nethsm >= 2.1.1 with python313-nethsm < 3 \
-python313-nitrokey >= 0.4.2 with python313-nitrokey < 0.5 \
-python313-nkdfu >= 0.2 with python313-nkdfu < 0.3 \
-python313-pyusb >= 1.2 with python313-pyusb < 2 \
-python313-requests >= 2.16 with python313-requests < 3 \
-python313-semver >= 3 with python313-semver < 4 \
-python313-tlv8 >= 0.10 with python313-tlv8 < 0.11 \
-python313-tqdm >= 4.64 with python313-tqdm < 5 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
