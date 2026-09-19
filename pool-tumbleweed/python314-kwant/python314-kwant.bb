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

RPM_NAME = "python314-kwant-1.5.0-2.8.aarch64.rpm"
RPM_HASH = "6696bac68277a8924ee7a45047d953f2dce18ea0f09b759a1281755d63b9d1a48eed29a0d4f31cdb56f9758965d56a129e6a7ca10060a5da7920a100535b17ea"

RPROVIDES:${PN} += "python3.14dist-kwant \
python314-kwant \
python3dist-kwant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmumps-seq.so.5.3.5 \
python-abi \
python314-numpy \
python314-scipy \
python314-tinyarray"

inherit rpm
