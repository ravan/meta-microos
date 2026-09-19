SUMMARY = "Microsoft Azure Attestation Client Library for Python"
DESCRIPTION = "The Microsoft Azure Attestation (MAA) service is a unified solution for remotely verifying the \
trustworthiness of a platform and integrity of the binaries running inside it. The service \
supports attestation of the platforms backed by Trusted Platform Modules (TPMs) alongside the \
ability to attest to the state of Trusted Execution Environments (TEEs) such as Intel(tm) \
Software Guard Extensions (SGX) enclaves and Virtualization-based Security (VBS) enclaves. \
 \
Attestation is a process for demonstrating that software binaries were properly instantiated \
on a trusted platform. Remote relying parties can then gain confidence that only such intended \
software is running on trusted hardware. Azure Attestation is a unified customer-facing service \
and framework for attestation. \
 \
Azure Attestation enables cutting-edge security paradigms such as Azure Confidential computing \
and Intelligent Edge protection. Customers have been requesting the ability to independently \
verify the location of a machine, the posture of a virtual machine (VM) on that machine, and \
the environment within which enclaves are running on that VM. Azure Attestation will empower \
these and many additional customer requests. \
 \
Azure Attestation receives evidence from compute entities, turns them into a set of claims, \
validates them against configurable policies, and produces cryptographic proofs for claims-based \
applications (for example, relying parties and auditing authorities). \
 \
This package has been tested with Python 2.7, 3.6 to 3.9."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-security-attestation-1.0.0-3.9.noarch.rpm"
RPM_HASH = "85a91ffa0c8e311321a91518fbe655857cf3bedd2d2d51fefee5b373628d9c49f33835816cdec6443b762159428839fa2b8bab81cb5decd652facf704226c218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-security-attestation \
python3.13dist-azure-security-attestation \
python313-azure-security-attestation \
python3dist-azure-security-attestation"

RDEPENDS:${PN} += "-python313-azure-core >= 1.8.2 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-security-nspkg \
python313-cryptography \
python313-msrest"

inherit rpm
