SUMMARY = "Python library for numerical quantum transport calculations"
DESCRIPTION = "Kwant is a Python library for numerical calculations on tight-binding \
models with a strong focus on quantum transport. Kwant can be used to \
simulate a variety of systems and phenomena in quantum physics \
including: metals, graphene, topological insulators, quantum Hall \
effect, superconductivity, spintronics, molecular electronics, any \
combination of the above, and many other things. Kwant can calculate \
transport properties (conductance, noise, scattering matrix), \
dispersion relations, modes, wave functions, various Green’s \
functions, out-of-equilibrium local quantities."
LICENSE = "BSD-2-Clause"

PV = "1.5.0"

RPM_NAME = "python313-kwant-1.5.0-2.8.aarch64.rpm"
RPM_HASH = "9503c4912163940e5a97a58bde4fc3ada6e22b117b945ed22f088e7e69b555c310dfd3e10df46c0974cad019fc61c7ddea5051f254425bf3698389c02195e1e3"

RPROVIDES:${PN} += "python3-kwant \
python3.13dist-kwant \
python313-kwant \
python3dist-kwant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmumps-seq.so.5.3.5 \
python-abi \
python313-numpy \
python313-scipy \
python313-tinyarray"

inherit rpm
