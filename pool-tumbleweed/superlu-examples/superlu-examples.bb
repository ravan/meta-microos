SUMMARY = "Examples for superlu"
DESCRIPTION = "Example programs for SuperLU. \
SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "superlu-examples-7.0.1-1.5.noarch.rpm"
RPM_HASH = "b8b00a9976484783b8299332e2891f5a445f9551ae0b5d04ca59e5d389e75a0f1334d0a1845042315ffbd629ad232b5a091bf5b30664d4910d1e43e976a437b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-examples"

RDEPENDS:${PN} += ""

inherit rpm
