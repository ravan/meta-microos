SUMMARY = "Proton VPN local agent written in Rust"
DESCRIPTION = "It is a rust crate for communicating with the Proton LocalAgent, and Python bindings for that crate."
LICENSE = "GPL-3.0-only"

PV = "1.6.3"

RPM_NAME = "python314-proton-vpn-local-agent-1.6.3-2.2.aarch64.rpm"
RPM_HASH = "d332e1833bcb095c88efe22424188eb7c1b4be86ccdf5f1d940fc10dc3437d35b0fa8783222c87fb000e432d00baeb7d5aba724a760a79c18a221a1b0994a3a0"

RPROVIDES:${PN} += "python3.14dist-proton-vpn-local-agent \
python314-proton-vpn-local-agent \
python3dist-proton-vpn-local-agent"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python314-cryptography"

inherit rpm
