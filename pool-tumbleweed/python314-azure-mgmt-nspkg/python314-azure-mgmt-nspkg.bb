SUMMARY = "Microsoft Azure Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python314-azure-mgmt-nspkg-3.0.2-5.9.noarch.rpm"
RPM_HASH = "c67c264179c927e1e5e1808663dc57df20792f52e4c65d5ab5bf4e46722bc569a1f1f016baa7edfb739bdae34ce2c6d36b883c201e951159a416897f99a9d049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-nspkg \
python314-azure-mgmt-nspkg \
python3dist-azure-mgmt-nspkg"

RDEPENDS:${PN} += "python314-azure-nspkg"

inherit rpm
