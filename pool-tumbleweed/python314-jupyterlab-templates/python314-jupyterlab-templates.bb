SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.5.3"

RPM_NAME = "python314-jupyterlab-templates-0.5.3-2.2.noarch.rpm"
RPM_HASH = "3ba73fc7f284bdf2651ddbd1951da24e2344bd0488cd1fd616c1b8c07a5845dd844e0cdb7b71a824f9874480487cca3448dece39f18322bb1fa6cda57a7e3411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyterlab-templates \
python314-jupyter-jupyterlab-templates \
python314-jupyterlab-templates \
python3dist-jupyterlab-templates"

RDEPENDS:${PN} += "jupyter-jupyterlab-templates \
python-abi \
python314-jupyterlab"

inherit rpm
