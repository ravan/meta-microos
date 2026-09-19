SUMMARY = "Node.js Dependency generators for openSUSE"
DESCRIPTION = "This package generates Node.js Provides/Requires dependencies \
automatically for nodejs module packages in openSUSE."
LICENSE = "MIT"

PV = "10.beta11"

RPM_NAME = "nodejs-packaging-10.beta11-4.12.noarch.rpm"
RPM_HASH = "1d146f2d41ecde57fe4b801267af9824b181bd64d4ff8e185c8a3bb1f82c72173992715f75987252a993313e5b2f27a703b2a91ccda9a243a340231a688f488c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-packaging \
rpm-macro-nodejs-build \
rpm-macro-nodejs-check \
rpm-macro-nodejs-clean \
rpm-macro-nodejs-copy \
rpm-macro-nodejs-default-filter \
rpm-macro-nodejs-filelist \
rpm-macro-nodejs-find-provides-and-requires \
rpm-macro-nodejs-fixdep \
rpm-macro-nodejs-install \
rpm-macro-nodejs-mkdir \
rpm-macro-nodejs-modulesdir \
rpm-macro-nodejs-prep \
rpm-macro-nodejs-sitearch \
rpm-macro-nodejs-sitelib \
rpm-macro-nodejs-symlink-deps \
rpm-macro-nodejs-version"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby \
gcc-c++ \
nodejs-devel \
npm \
ruby \
rubygem-json"

inherit rpm
