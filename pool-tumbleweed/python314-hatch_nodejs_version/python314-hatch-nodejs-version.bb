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

RPM_NAME = "python314-hatch_nodejs_version-0.4.0-1.4.noarch.rpm"
RPM_HASH = "d5a3a6e6b3c06529e10c8b4ec4966820b9da1533295562719ad544afb0d9e0304d570814a33b369d94b8631fca159b589a15be4cae558a0a28e6d17876a8b926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hatch-nodejs-version \
python314-hatch-nodejs-version \
python3dist-hatch-nodejs-version"

RDEPENDS:${PN} += "python-abi \
python314-hatchling"

inherit rpm
