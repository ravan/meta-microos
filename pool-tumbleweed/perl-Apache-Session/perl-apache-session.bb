SUMMARY = "Persistence framework for session data"
DESCRIPTION = "Apache::Session is a persistence framework which is particularly useful for \
tracking session data between httpd requests. Apache::Session is designed \
to work with Apache and mod_perl, but it should work under CGI and other \
web servers, and it also works outside of a web server altogether. \
 \
Apache::Session consists of five components: the interface, the object \
store, the lock manager, the ID generator, and the serializer. The \
interface is defined in Session.pm, which is meant to be easily subclassed. \
The object store can be the filesystem, a Berkeley DB, a MySQL DB, an \
Oracle DB, a Postgres DB, Sybase, or Informix. Locking is done by lock \
files, semaphores, or the locking capabilities of the various databases. \
Serialization is done via Storable, and optionally ASCII-fied via MIME or \
pack(). ID numbers are generated via MD5. The reader is encouraged to \
extend these capabilities to meet his own requirements. \
 \
A derived class of Apache::Session is used to tie together the three \
following components. The derived class inherits the interface from \
Apache::Session, and specifies which store and locker classes to use. \
Apache::Session::MySQL, for instance, uses the MySQL storage class and also \
the MySQL locking class. You can easily plug in your own object store or \
locker class."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.940.0"

RPM_NAME = "perl-Apache-Session-1.940.0-1.7.noarch.rpm"
RPM_HASH = "b3f07a7b7fd7f4f001b872b9eadf1a6a621f19034d0219c3544019ca22b18e538bcb2e786c8f7ff2c45c4348ce834a6b56464c54135715d7e6295558cf111adf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Apache--Session \
perl-Apache--Session--DB-File \
perl-Apache--Session--File \
perl-Apache--Session--Flex \
perl-Apache--Session--Generate--MD5 \
perl-Apache--Session--Generate--ModUniqueId \
perl-Apache--Session--Generate--ModUsertrack \
perl-Apache--Session--Informix \
perl-Apache--Session--Lock--File \
perl-Apache--Session--Lock--MySQL \
perl-Apache--Session--Lock--Null \
perl-Apache--Session--Lock--Semaphore \
perl-Apache--Session--Lock--Sybase \
perl-Apache--Session--MySQL \
perl-Apache--Session--MySQL--NoLock \
perl-Apache--Session--Oracle \
perl-Apache--Session--Postgres \
perl-Apache--Session--Serialize--Base64 \
perl-Apache--Session--Serialize--Storable \
perl-Apache--Session--Serialize--Sybase \
perl-Apache--Session--Serialize--UUEncode \
perl-Apache--Session--Store--DB-File \
perl-Apache--Session--Store--DBI \
perl-Apache--Session--Store--File \
perl-Apache--Session--Store--Informix \
perl-Apache--Session--Store--MySQL \
perl-Apache--Session--Store--Oracle \
perl-Apache--Session--Store--Postgres \
perl-Apache--Session--Store--Sybase \
perl-Apache--Session--Sybase \
perl-Apache-Session"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
