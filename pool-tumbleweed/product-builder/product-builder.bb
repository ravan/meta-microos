SUMMARY = "SUSE Product Builder"
DESCRIPTION = "The SUSE product builder, builds product media (CD/DVD) for \
the SUSE product portfolio. Based on kiwi perl implementation. \
 \
To be used only for product medias for Leap 15 and SLE 15."
LICENSE = "GPL-2.0-only"

PV = "1.4.14"

RPM_NAME = "product-builder-1.4.14-1.10.aarch64.rpm"
RPM_HASH = "85f533bd1b3607a629407ff3e2b71b2270da29dbd6c1f72f00be335902e480711b411020cf42d6d2f193f087fd7354df4b6fefcca072fc64fb3894eb5b68567e"

RPROVIDES:${PN} += "kiwi-packagemanager-instsource \
kiwi-schema \
perl-KIWIArch \
perl-KIWIArchList \
perl-KIWICollect \
perl-KIWICommandLine \
perl-KIWIGlobals \
perl-KIWIIsoLinux \
perl-KIWILocator \
perl-KIWILog \
perl-KIWIProductData \
perl-KIWIQX \
perl-KIWIRepoMetaHandler \
perl-KIWITrace \
perl-KIWIURL \
perl-KIWIUtil \
perl-KIWIXML \
perl-KIWIXMLDataBase \
perl-KIWIXMLDefStripData \
perl-KIWIXMLDescriptionData \
perl-KIWIXMLDriverData \
perl-KIWIXMLExceptData \
perl-KIWIXMLFileData \
perl-KIWIXMLInstRepositoryData \
perl-KIWIXMLOEMConfigData \
perl-KIWIXMLPXEDeployConfigData \
perl-KIWIXMLPXEDeployData \
perl-KIWIXMLPackageArchiveData \
perl-KIWIXMLPackageCollectData \
perl-KIWIXMLPackageData \
perl-KIWIXMLPackageIgnoreData \
perl-KIWIXMLPackageProductData \
perl-KIWIXMLPreferenceData \
perl-KIWIXMLProductArchitectureData \
perl-KIWIXMLProductMetaChrootData \
perl-KIWIXMLProductMetaFileData \
perl-KIWIXMLProductOptionsData \
perl-KIWIXMLProductPackageData \
perl-KIWIXMLProfileData \
perl-KIWIXMLRepositoryBaseData \
perl-KIWIXMLRepositoryData \
perl-KIWIXMLSplitData \
perl-KIWIXMLStripData \
perl-KIWIXMLSystemdiskData \
perl-KIWIXMLTypeData \
perl-KIWIXMLUserData \
perl-KIWIXMLVMachineData \
perl-KIWIXMLVagrantConfigData \
perl-KIWIXMLValidator \
product-builder \
system-packages-kiwi-product"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
build \
checkmedia \
inst-source-utils \
libxslt \
mkisofs \
perl \
perl-Class-Singleton \
perl-Config-IniFiles \
perl-File-Slurp \
perl-JSON \
perl-Readonly \
perl-XML-LibXML \
perl-XML-LibXML-Common \
perl-XML-SAX \
perl-libwww-perl \
product-builder-plugin"

inherit rpm
