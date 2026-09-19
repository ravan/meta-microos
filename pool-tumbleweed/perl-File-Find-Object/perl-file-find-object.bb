SUMMARY = "An object oriented File::Find replacement"
DESCRIPTION = "File::Find::Object does the same job as File::Find but works like an object \
and with an iterator. As File::Find is not object oriented, one cannot \
perform multiple searches in the same application. The second problem of \
File::Find is its file processing: after starting its main loop, one cannot \
easily wait for another event and so get the next result. \
 \
With File::Find::Object you can get the next file by calling the next() \
function, but setting a callback is still possible."
LICENSE = "Artistic-2.0"

PV = "0.3.9"

RPM_NAME = "perl-File-Find-Object-0.3.9-1.10.noarch.rpm"
RPM_HASH = "119f732bae798a9a467ea2bc961c096bde3381de0d24d2514012837a3659587d98123fa301a1489fee39ed69c19a95f4c94e10788f6a66cd19acddfefbc106eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Find--Object \
perl-File--Find--Object--Base \
perl-File--Find--Object--DeepPath \
perl-File--Find--Object--PathComp \
perl-File--Find--Object--Result \
perl-File--Find--Object--TopPath \
perl-File-Find-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--XSAccessor \
perl-parent"

inherit rpm
