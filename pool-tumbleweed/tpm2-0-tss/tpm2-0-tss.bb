SUMMARY = "Intel's TCG Software Stack access libraries for TPM 2.0 chips"
DESCRIPTION = "The tpm2-0-tss package provides a TPM 2.0 TSS implementation. This \
implementation is developed by INTEL. This package contains the libraries, \
see the tpm2.0-abrmd package for the resource manager daemon, tpm2.0-tools for \
utilities."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "tpm2-0-tss-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "fbe8422ac55ab7d7eb59b4787a2613d0db6b9b3f0bbf9f0eed2e342d353f761a3a3ca49235d8f53bed86f207e8caa832a88a67e8ec9234039f54cde665f8a8d0"

RPROVIDES:${PN} += "config-tpm2-0-tss \
tpm2-0-tss"

RDEPENDS:${PN} += "/usr/bin/sh \
udev \
user-tss"

inherit rpm
