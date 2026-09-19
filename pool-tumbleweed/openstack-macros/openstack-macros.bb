SUMMARY = "OpenStack Packaging - RPM Macros"
DESCRIPTION = "This package provides OpenStack RPM macros. You need it to build OpenStack \
packages."
LICENSE = "Apache-2.0"

PV = "2020.1.2"

RPM_NAME = "openstack-macros-2020.1.2-3.9.noarch.rpm"
RPM_HASH = "e05ddb6f773fada115b3f15044f3af6f4a14b68f84179220a6d4ae9bdbd623e1445afd033198007faed032d5dc57ae4ad58171329caa0e68084ba1b480025f14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openstack-macros \
rpm-macro--defaultlicensedir \
rpm-macro-apache-conf-dir \
rpm-macro-apache-group \
rpm-macro-apache-name \
rpm-macro-apache-site-dir \
rpm-macro-apache-user \
rpm-macro-gpgverify \
rpm-macro-http-dashboard-dir \
rpm-macro-openstack-pre-user-group-create \
rpm-macro-openstack-stestr-run \
rpm-macro-openstack-test-package-dir \
rpm-macro-openstack-test-package-install \
rpm-macro-py-build \
rpm-macro-py-req-cleanup \
rpm-macro-py-setup \
rpm-macro-py-shbang-opts \
rpm-macro-py2-build \
rpm-macro-py2-entrypoint \
rpm-macro-py2-install \
rpm-macro-py2-shbang-opts \
rpm-macro-pycached \
rpm-macro-python2-sitearch \
rpm-macro-python2-sitelib \
rpm-macro-sphinx-build"

RDEPENDS:${PN} += ""

inherit rpm
