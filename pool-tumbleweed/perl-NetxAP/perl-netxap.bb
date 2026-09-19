SUMMARY = "Interface to the protocol family IMAP, IMSP, ACAP, and ICAP"
DESCRIPTION = "This module provides an interface to the protocol family represented by \
IMAP, IMSP, ACAP, and ICAP.  A usable IMAP module is also provide."
LICENSE = "Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-NetxAP-0.02-723.12.aarch64.rpm"
RPM_HASH = "18df00c99e68268a338e830ead37caabe3b142c5ce5e9ee5bd1da8d02ddf64f6cd85f27eae189f878b399f9324e82cad038b8551efdf1f1f07ddb1ea511f1219"

RPROVIDES:${PN} += "p-netxap \
perl-Net--IMAP \
perl-Net--IMAP--Acl \
perl-Net--IMAP--Addr \
perl-Net--IMAP--Bad \
perl-Net--IMAP--BodyStructure \
perl-Net--IMAP--Bodypart \
perl-Net--IMAP--Bye \
perl-Net--IMAP--Capability \
perl-Net--IMAP--Cond \
perl-Net--IMAP--Envelope \
perl-Net--IMAP--Exists \
perl-Net--IMAP--Expunge \
perl-Net--IMAP--Fetch \
perl-Net--IMAP--FetchData \
perl-Net--IMAP--Flags \
perl-Net--IMAP--List \
perl-Net--IMAP--Listrights \
perl-Net--IMAP--Lsub \
perl-Net--IMAP--Multipart \
perl-Net--IMAP--Myrights \
perl-Net--IMAP--Namespace \
perl-Net--IMAP--No \
perl-Net--IMAP--Ok \
perl-Net--IMAP--Quota \
perl-Net--IMAP--Quotaroot \
perl-Net--IMAP--Recent \
perl-Net--IMAP--Response \
perl-Net--IMAP--Search \
perl-Net--IMAP--Status \
perl-Net--IMAP--UntaggedResponse \
perl-Net--xAP \
perl-Net--xAP--Response \
perl-NetxAP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Digest-HMAC"

inherit rpm
