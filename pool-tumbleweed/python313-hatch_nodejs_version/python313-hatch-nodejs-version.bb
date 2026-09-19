SUMMARY = "This package provides two Hatch plugins for nodejs"
DESCRIPTION = "Hatch plugin to read pyproject.toml metadata from package.json \
 \
This package provides two Hatch plugins: \
 \
* version source plugin that reads/writes the package version \
  from the version field of the Node.js package.json file. \
* metadata hook plugin that reads PEP 621 metadata from the \
  Node.js package.json file."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-hatch_nodejs_version-0.4.0-1.4.noarch.rpm"
RPM_HASH = "ec4479f37e691e0cc0b9d4bbb08705e5ac45e77de5544ad78607d7f3dffafd8a603b2847789e76c7dcb897969c9551068920155adf28ceb6f9d66a2f570345ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-nodejs-version \
python3.13dist-hatch-nodejs-version \
python313-hatch-nodejs-version \
python3dist-hatch-nodejs-version"

RDEPENDS:${PN} += "python-abi \
python313-hatchling"

inherit rpm
