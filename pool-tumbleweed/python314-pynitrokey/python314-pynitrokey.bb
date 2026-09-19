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

RPM_NAME = "python314-pynitrokey-0.12.3-1.2.noarch.rpm"
RPM_HASH = "c566f049c0fe571acfcd9e5fa521d0eb2ba01fdb3ee32568c9a94ff7feaa50c5dcab976efeff4534633d6f7bc7cd3512f0eb994424ef9a4607d4b825781c2935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nitropy \
python3.14dist-pynitrokey \
python314-pynitrokey \
python3dist-pynitrokey"

RDEPENDS:${PN} += "-intelhex >= 2.3 with intelhex < 3 \
-python314-cffi >= 1.15 with python314-cffi < 3 \
-python314-click >= 8.2 with python314-click < 9 \
-python314-cryptography >= 43 with python314-cryptography < 50 \
-python314-fido2 >= 2 with python314-fido2 < 3 \
-python314-hidapi >= 0.14.0.post2 with python314-hidapi < 0.14.0.post3 \
-python314-libusb1 >= 3 with python314-libusb1 < 4 \
-python314-nethsm >= 2.1.1 with python314-nethsm < 3 \
-python314-nitrokey >= 0.4.2 with python314-nitrokey < 0.5 \
-python314-nkdfu >= 0.2 with python314-nkdfu < 0.3 \
-python314-pyusb >= 1.2 with python314-pyusb < 2 \
-python314-requests >= 2.16 with python314-requests < 3 \
-python314-semver >= 3 with python314-semver < 4 \
-python314-tlv8 >= 0.10 with python314-tlv8 < 0.11 \
-python314-tqdm >= 4.64 with python314-tqdm < 5 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
