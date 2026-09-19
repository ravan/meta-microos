SUMMARY = "Python tool to dump binary data"
DESCRIPTION = "This utility converts between the raw representation and a \
byte-based hexdump representation. \
 \
The display is equivalent to the output of the `hexdump -C` command, but \
it requires a Python runtime."
LICENSE = "Unlicense"

PV = "3.3"

RPM_NAME = "python313-hexdump-3.3-4.5.noarch.rpm"
RPM_HASH = "d2cc459021b2baeb772550df8dee7ffcba50f17ab6c40df299168ac81076e258f330b4e384bedf8f46ccdde5bea7f851a2f010c48eeeb4622895a9e0880a7a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hexdump \
python3.13dist-hexdump \
python313-hexdump \
python3dist-hexdump"

RDEPENDS:${PN} += "python-abi"

inherit rpm
