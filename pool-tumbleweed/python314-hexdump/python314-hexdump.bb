SUMMARY = "Python tool to dump binary data"
DESCRIPTION = "This utility converts between the raw representation and a \
byte-based hexdump representation. \
 \
The display is equivalent to the output of the `hexdump -C` command, but \
it requires a Python runtime."
LICENSE = "Unlicense"

PV = "3.3"

RPM_NAME = "python314-hexdump-3.3-4.5.noarch.rpm"
RPM_HASH = "5c00baaf4b434ac7aef8d702120b933fa1d150198df351381edaaf376a5a09ce265419585924ae7bdee6746b4f5f9e5249266db90fb68fc1205848616a67b0e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hexdump \
python314-hexdump \
python3dist-hexdump"

RDEPENDS:${PN} += "python-abi"

inherit rpm
