SUMMARY = "Proton VPN local agent written in Rust"
DESCRIPTION = "It is a rust crate for communicating with the Proton LocalAgent, and Python bindings for that crate."
LICENSE = "GPL-3.0-only"

PV = "1.6.3"

RPM_NAME = "python313-proton-vpn-local-agent-1.6.3-2.2.aarch64.rpm"
RPM_HASH = "cc08067485dc87f582739651357c6b36497ce9acf11cead88d9413b40aaabcd755e3b69f0b309728a71267ef3f90b5b07e19013d342630e864677c76d9b35e74"

RPROVIDES:${PN} += "python3-proton-vpn-local-agent \
python3.13dist-proton-vpn-local-agent \
python313-proton-vpn-local-agent \
python3dist-proton-vpn-local-agent"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python313-cryptography"

inherit rpm
