SUMMARY = "Sphinx extension to support docstrings in Numpy format"
DESCRIPTION = "Numpy's documentation uses several custom extensions to Sphinx.  These \
are shipped in this numpydoc package, in case you want to make use \
of them in third-party projects."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "python313-numpydoc-1.10.0-1.3.noarch.rpm"
RPM_HASH = "a9049def37e55b5080054cf83b85219bd8c5e243f6e2430c8ab77659eff6a6967770c871714f6582c949caff0a82a4f0be7bcf5a76a53059b4ce2769eb33fc7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-numpydoc \
python3.13dist-numpydoc \
python313-numpydoc \
python3dist-numpydoc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Sphinx \
update-alternatives"

inherit rpm
