SUMMARY = "Experimental Neural Net speech coding for FreeDV"
DESCRIPTION = "Experimental version of LPCNet that has been used to develop FreeDV 2020 - a HF \
radio Digital Voice mode for over the air experimentation with Neural Net \
speech coding. It includes a prebuilt model."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "lpcnet-0.5-1.6.aarch64.rpm"
RPM_HASH = "bbe8545d5cf165622709bda81f7af6705e37382e20e10903a010cc91a6a5b1edb1bb8a6d98535afa74fcbe83ab879d57631c23daa3b8af142f0384874689057f"

RPROVIDES:${PN} += "lpcnet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblpcnetfreedv.so.0.5 \
libm.so.6"

inherit rpm
