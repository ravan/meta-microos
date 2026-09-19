SUMMARY = "Microsoft Azure Purview Sharing Client Library for Python"
DESCRIPTION = "Microsoft Purview Share is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python314-azure-purview-sharing-1.0.0~b3-2.9.noarch.rpm"
RPM_HASH = "bc611adf9095545b74494d634f84d35ce997522349445bf7ade3bf5c341ff249e68072a876ad0a010b4d132579bb9f652ddf04fd4080c1c4cc72ef9f719e027d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-purview-sharing \
python314-azure-purview-sharing \
python3dist-azure-purview-sharing"

RDEPENDS:${PN} += "-python314-azure-core >= 1.24.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-purview-nspkg"

inherit rpm
